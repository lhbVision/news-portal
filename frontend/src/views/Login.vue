<template>
  <div>
    <h2>登录</h2>
    <div>
      <input v-model="username" placeholder="用户名">
    </div>
    <div>
      <input v-model="password" type="password" placeholder="密码">
    </div>
    <button @click="login">登录</button>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const username = ref('')
const password = ref('')

const login = async () => {
  if (!username.value || !password.value) {
    alert('请输入用户名和密码')
    return
  }

  try {
    const response = await fetch('http://localhost:8080/api/auth/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        username: username.value,
        password: password.value
      })
    })
    
    const data = await response.json()
    console.log('登录结果:', data)
    
    if (data.code === 200) {
      localStorage.setItem('token', 'demo-token')
      router.push('/')
    } else {
      alert('登录失败: ' + data.message)
    }
  } catch (error) {
    console.error('登录错误:', error)
    alert('网络错误，请检查后端是否运行')
  }
}
</script>>
