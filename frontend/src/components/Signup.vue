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
            <div class="row justify-content-center">
                <hr />
                <p class="fs-2">書籍</p>
                <div class="col"  v-for="(book, bookId) in booklist" :key="bookId">
                    <button class="btn btn-secondary btn-lg" style="width: 60%; height: 100%;">
                        <p class="fs-5">{{ book.title }}</p>
                    </button>
                    <div class="py-1" style="height: 50%;">
                        <p class="fs-6 ">作者:{{ book.author }}</p>
                        <p class="fs-6">摘要:{{ book.introductionl }}</p>
                        <p class="fs-6t">ISBN:{{ book.isbn }}</p>
                        <p class="fs-6">作者:{{ book.author }}</p>
                    </div>
                    <button class="btn btn-secondary btn-lg" style="width: 90px; height: 40px; margin-bottom: 3%;">
                        <p v-if="book.status == 0" class="fs-6">可借閱</p>
                        <p v-if="book.status !== 0" class="fs-6">出借中</p>
                    </button>
                </div>
            </div>
        </div>
    </body>
</template>