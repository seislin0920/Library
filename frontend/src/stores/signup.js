import axios from "axios";
import { defineStore } from "pinia";
import { ref } from "vue";

export const useSignup = defineStore("SignupStore", () => {
    let SignupPhone = ref(null);
    let SignupUserName = ref(null);
    let SignupPassword = ref(null);
    const Signup = async (InPhone, InPassword, inUserName) => {
        try {
             await axios
                  .post("http://localhost:8080/user", {
                      phone: InPhone,     
                      password: InPassword,
                      userName: inUserName
                 })
                  .then((response) => {
                      console.log(response.data);
                  });
        } catch (err) {}
    };

    return {
        SignupPhone,
        SignupUserName,
        SignupPassword,
        Signup
    };
});