<template>
    <div>
        用户名：<input v-model="loginForm.username" type="text" placeholder="用户名">
        <br>
        密码：<input v-model="loginForm.password" type="password" placeholder="密码">
        <br>
        <button v-on:click="login" type="submit">登陆</button>
    </div>
</template>

<script>
    export default {
        name: 'Login',
        data: function () {
            return {
                loginForm: {
                    username: '',
                    password: ''
                },
                responseResult: []
            }
        },
        methods: {
            login() {
                this.$axios
                .post('/login', {
                    username: this.loginForm.username,
                    password: this.loginForm.password
                })
                .then(successResponse => {
                    if (successResponse.data.code === 200) {
                        this.$router.replace({path: '/index'})
                    }
                }).catch(failResponse => {
                    console.log("login failed!" + failResponse)
                })
            }
        }
    }
</script>,
