<script setup>
import { useSignup } from '@/stores/signup.js';
import { storeToRefs } from 'pinia';

const {Signup} = useSignup();

const {SignupPhone, SignupUserName, SignupPassword} = storeToRefs(useSignup());
</script>

<template>
    <body class="homepage is-preload">
        <div class="container text-center py-5">
            <div class="row d-flex justify-content-center">
                <hr />
                <p class="fs-2">Register</p>
                <!-- registration-->
                <div class="col">
                    <input type="text" id="phone" placeholder="手機號碼(ex:09...)" 
                    v-model="SignupPhone">
                </div>
                <div class="col">
                    <input type="text" id="username" placeholder="使用者名稱"
                    v-model="SignupUserName">
                </div>
                <div class="col">
                    <input type="password" id="password" placeholder="Password"
                    v-model="SignupPassword">
                </div>
            </div>
            <button class="my-3" style="width: 50%;" @click="Signup(SignupPhone,SignupUserName,SignupPassword)">Register</button>
            <p>Already have an account? 
                <RouterLink to="/login">Login here</RouterLink>
            </p>
        </div>
    </body>
</template>