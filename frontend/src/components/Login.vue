<script setup>
import { useGetBook } from '@/stores/getBook.js';
import { storeToRefs } from 'pinia';

const {getbook} = useGetBook();
getbook();

const {booklist} = storeToRefs(useGetBook());
</script>

<template>
    <body class="homepage is-preload">
        <div class="container text-center py-5">
            <div class="row d-flex justify-content-center">
                <hr />
                <p class="fs-2">Login</p>
                <!-- registration-->
                <div class="col">
                    <input type="text" id="username" placeholder="手機號碼(ex:09...)">
                </div>
                <div class="col">
                    <input type="password" id="password" placeholder="Password">
                </div>
            </div>
            <button class="my-3" style="width: 50%;">Login</button>
            <p>Already have an account? 
                <RouterLink to="/signup">Singup here</RouterLink>
            </p>
        </div>
    </body>
</template>