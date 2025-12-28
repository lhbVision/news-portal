<template>
  <div>
    <h2>登录</h2>
    <form @submit.prevent="handleLogin">
      <div>
        <input v-model="username" placeholder="用户名" />
      </div>
      <div>
        <input v-model="password" type="password" placeholder="密码" />
      </div>
      <button type="submit">登录</button>
    </form>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const username = ref('')
const password = ref('')

const handleLogin = () => {
  // 简单登录逻辑
  if (username.value && password.value) {
    localStorage.setItem('token', 'demo-token')
    router.push('/')
  }
}
</script>
