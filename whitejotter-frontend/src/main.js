import Vue from 'vue'
import App from './App.vue'

import router from './router'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.config.productionTip = false

// axios configs
var axios = require('axios')
Vue.prototype.$axios = axios
axios.defaults.baseURL="http://localhost:8443/api"

Vue.use(ElementUI)



new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
