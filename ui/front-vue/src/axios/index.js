import Vue from 'vue'
import Axios from 'axios'

Vue.use(Axios);

// const axios = new Axios({
//     baseURL: 'localhost:8080/api/v1/',
//     headers: { 'Access-Control-Allow-Origin': '*' }
// })

const instance = Axios.create({
    baseURL: 'http://192.168.0.100:8080/api/v1/',
    headers: { 'Access-Control-Allow-Origin': '*' }
})
Vue.prototype.$axios = instance

export default instance