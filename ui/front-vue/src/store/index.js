import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        ASIDE: ''
    },
    mutations: {
        ASIDE_CHANGE(state, to) {
            state.ASIDE = to
            console.log('=====state:', state)
        }
    },
    actions: {},
    modules: {},
});