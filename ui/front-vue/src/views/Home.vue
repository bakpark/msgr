<template>
  <div class="home">
    <Login></Login>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from "@/components/HelloWorld.vue";
import Login from '@/components/Login.vue'
export default {
  name: "Home",
  components: {
    Login
  },

  /*****************************************************************
  ********************** computed, watch ***********************
  *****************************************************************/
  computed: {
  },
  watch: {
  },
 /*****************************************************************
  ************************** Life-Cycle ***************************
  *****************************************************************/
  created() {
  },
  mounted() {
    this.$store.commit('ASIDE_CHANGE', 'HOME')
  },
  beforeDestroy() {
  },
  destroyed() {
  },
};
</script>

<style scoped>
</style>
