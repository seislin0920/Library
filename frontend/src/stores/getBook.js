import axios from "axios";
import { defineStore } from "pinia";
import { ref } from "vue";

export const useGetBook = defineStore("GetBookStore", () => {
    let booklist = ref(null)
    const getbook = async () => {
          try {
               await axios
                    .get("http://localhost:8080/booklist")
                    .then((response) => {
                        booklist.value = response.data;
                        console.log(response.data);
                    });
          } catch (err) {}
    };

    return {
        getbook,
        booklist
    };
});