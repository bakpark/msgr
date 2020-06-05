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
  ************************** Life-Cycle ***************************
  *****************************************************************/
  created() {
  },
  mounted() {
    console.log('========== mounted')
    console.log('========== axios get:',this.$axios.get('/user/get?userId=1'))
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
      console.log('on click register', this.id, this.email)
      console.log(this.$axios)
    },
    onClickLogin() {
      console.log('on click login', this.id, this.email)
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