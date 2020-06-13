<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/Main">Main</router-link> |
      <router-link to="/TestRoom">Test Room</router-link>
    </div>
    <router-view />
    <aside><Aside></Aside></aside>
  </div>
</template>
<script>
import Aside from '@/components/Aside.vue'
export default {
  components: {
    Aside: Aside
  }
  
}
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

aside {
  display: flex;
  justify-content: flex-end;
  width: 90%;
  font-style: italic;
}
</style>
