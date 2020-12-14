import Vue from 'vue'
import Router from 'vue-router'

import Login from '@/components/Login'
import AppIndex from "@/components/home/AppIndex";

Vue.use(Router);

export default new Router({
    routes: [
        { path: '/', redirect: '/login' },
        {
            path: '/login',
            name: 'Login',
            component: Login
        },
        {
            path: '/index',
            name: 'Index',
            component: AppIndex
        }
    ]
})