import Vue from 'vue'
import Axios from 'axios'

Vue.use(Axios);

const instance = Axios.create({
    baseURL: 'http://localhost:8080/api/v1/',
    headers: { 'Access-Control-Allow-Origin': '*' }
})
Vue.prototype.$axios = instance

export default instance