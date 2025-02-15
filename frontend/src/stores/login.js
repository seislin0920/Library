import axios from "axios";
import { defineStore } from "pinia";
import { ref } from "vue";

export const useLogin = defineStore("LoginStore", () => {
    let LoginPhone = ref(null);
    let LoginPassword = ref(null);
    const Login = async (InPhone, InPassword) => {       
        try {
             await axios
                  .post("http://localhost:8080/login", {
                      phone: InPhone,     
                      password: InPassword,
                 })
                  .then((response) => {
                    console.log( {
                        phone: InPhone,     
                        password: InPassword,
                   });
                      console.log(response.data);
                  });
        } catch (err) {}
    };

    return {
        LoginPhone,
        LoginPassword,
        Login
    };
});