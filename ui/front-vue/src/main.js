import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import axios from './axios';
import VueNativeSock from 'vue-native-websocket'

Vue.use(VueNativeSock, 'ws://192.168.0.100:8080', {
    connectManually: true
})


Vue.config.productionTip = false;
let vm = new Vue({
    router,
    store,
    axios,
    render: h => h(App)
}).$mount("#app")

vm.$connect()
vm.$connect('ws://192.168.0.100:8080/socket', { format: 'json' })
