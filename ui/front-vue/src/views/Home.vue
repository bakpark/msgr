<template>
  <div class="home">
    <Login></Login>
    <aside><Aside></Aside></aside>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from "@/components/HelloWorld.vue";
import Login from '@/components/Login.vue'
import Aside from '@/components/Aside.vue'
export default {
  name: "Home",
  components: {
    Login,
    Aside
  }
};
</script>

<style scoped>
aside {
  width: 30%;
  padding-left: 15px;
  margin-left: 15px;
  float: right;
  font-style: italic;
  background-color: lightgray;
}
</style>
