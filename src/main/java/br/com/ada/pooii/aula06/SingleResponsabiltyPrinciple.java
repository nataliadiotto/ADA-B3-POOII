package br.com.ada.pooii.aula06;

public class SingleResponsabiltyPrinciple {
    public class User {
        private String name;
        private String email;
        private String cpf;

        // Métodos de acesso (getters/setters)

        public class UserRepository{
            public void saveUser() {
                // Salva o usuário no banco de dados
            }
        }

        public class EmailService {
            public void sendEmail(String message) {
                // Envia um e-mail para o usuário
            }
        }

        public class SMSService{
            public void sendSMS(String message) {
                // Envia um SMS para o usuário
            }
        }


        public class CPFService{
            public boolean isValidCPF() {
                return true;
                // Faz o calculo para verificar se o CPF é valido
            }
        }
        }

    }

}
