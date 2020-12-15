import Vue from 'vue'
import App from './App.vue'


import router from './router'

var axios = require('axios')

Vue.config.productionTip = false

Vue.prototype.$axios = axios
axios.defaults.baseURL="http://localhost:8443/api"

new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
