<template>
  <div class="login">
    <div class="container">    
      <div class="container2">
        <span>UserId</span>
        <input v-model="id" placeholder="MessengerId"/>
      </div>  
    </div>
    <div class="container">    
      <div class="container2">
        <span> Email </span>
        <input v-model="email" placeholder="User@email.com" @keyup.enter="onClickLogin">
      </div>  
    </div>
    <div class="container">
      <button @click="onClickRegister">Register</button>
      <button @click="onClickLogin">Login</button>
    </div>
    
  </div>
</template>


<script>
/*****************************************************************
 ************************** import *******************************
 *****************************************************************/
// import login from '@/Login.vue'

export default {
  name: "Login",
  components: {
  },
  props: {
    msg: String
  },
  data() {
    return{
      id: '',
      email: ''
    }
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
  },
  beforeDestroy() {
  },
  destroyed() {
  },
 /*****************************************************************
  ********************** User-Defined Methods *********************
  *****************************************************************/
  methods: {
    onClickRegister() {
      let param = {
        name: this.id,
        email: this.email
      }
      this.$axios.post('user/register', param)
      .then((response) => {
          this.$store.status.userInfo = response.data
          // Todo:
          window.alert('register success')
      })
      .catch((err) => {
        window.alert('fail', err)
      })
    },
    onClickLogin() {
      let param = {
        name: this.id,
        email: this.email
      }
      this.$axios.post('user/find', param)
      .then((response) => {
        this.$store.status.userInfo = response.data
        // Todo:
        window.alert('login success')
      })
      .catch((err) => {
        window.alert('fail', err)
      })
    }

  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
p {
  margin: 5px;
  right: 40%;
  position: absolute;
}
span {
  position: relative;
  padding: 10px;
}
input {
  width: 200px;
  border: inset;
  position: relative;
}
button {
  margin: 5px;
  position: relative;
}
div.container {
  width: 100%;
  padding: 5px;
}
div.container2 {
   width: 100%;
}
</style>