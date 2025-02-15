<script setup>

</script>

<template>
    <body class="homepage is-preload">
        <div class="container text-center py-2">
            <div class="row">
                <div class="col">
                    <router-link to="/signup">
                        <button class="btn btn-outline-info" style="height: 80px;">
                            <p class="fs-1">註冊</p>
                        </button>
                    </router-link>
                </div>
                <div class="col">
                    <router-link to="/">
                        <button class="btn btn-outline-warning" style="height: 80px;">
                            <p class="fs-1">圖書館首頁</p>
                        </button>
                    </router-link>
                </div>
                <div class="col">
                    <router-link to="/login">
                        <button class="btn btn-outline-success" style="height: 80px;">
                            <p class="fs-1">登入</p>
                        </button>
                    </router-link>
                </div>
            </div>
        </div>
    </body>
</template>