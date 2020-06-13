<template>
  <div class="Aside">
    <div v-if="state === 'HOME'">
        <tbody>
            <tr>
                <th>No.</th>
                <th>PK</th>
                <th>UserName</th>
                <th>Email</th>
            </tr>
            <tr v-for="(userInfo, idx) in userInfos" :key="userInfo.userId">
                <td>#{{ idx }}</td>
                <td>{{ userInfo.userId }}</td>
                <td>{{ userInfo.name }}</td>
                <td>{{ userInfo.email }}</td>
            </tr>
        </tbody>
        <button style="border:solid 2px black;" @click="forceUpdate">Update</button>
    </div>
    <div v-else-if="state === 'MAIN'">
      <span>MAIN</span>
    </div>
  </div>
</template>


<script>
/*****************************************************************
 ************************** import *******************************
 *****************************************************************/
// import login from '@/Login.vue'


export default {
  name: "Aside",
  components: {
  },
  props: {
  },
  data() {
    return{
        userInfos: []
    }
  },
  
 /*****************************************************************
  ********************** computed, watch ***********************
  *****************************************************************/
  computed: {
    state() {
      return this.$store.state.ASIDE
    }
  },
  watch: {
  },
 /*****************************************************************
  ************************** Life-Cycle ***************************
  *****************************************************************/
  created() {
      this.forceUpdate()
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
      forceUpdate() {
        let vueInstance = this
        this.$axios.get('user/getAll').then((response) => {
            vueInstance.userInfos = response.data
            vueInstance.$forceUpdate()
        })
      }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
table, th, td {
    border: 1px solid black;
    padding: 3px;
    background-color: darkgrey;
}
</style>