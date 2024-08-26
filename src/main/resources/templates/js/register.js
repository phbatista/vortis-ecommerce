document.addEventListener('DOMContentLoaded', function() {
    // Função para buscar e preencher o endereço baseado no CEP
    function buscarEndereco(cep) {
        fetch(`https://viacep.com.br/ws/${cep}/json/`)
            .then(response => response.json())
            .then(data => {
                if (data.erro) {
                    alert('CEP inválido');
                } else {
                    document.getElementById('rua').value = data.logradouro || '';
                    document.getElementById('bairro').value = data.bairro || '';
                    document.getElementById('cidade').value = data.localidade || '';
                    document.getElementById('uf').value = data.uf || '';
                }
            })
            .catch(error => {
                console.error('Erro ao buscar o endereço:', error);
            });
    }

    // Adiciona um ouvinte de evento para o campo CEP
    document.getElementById('cep').addEventListener('blur', function() {
        const cep = this.value.replace(/\D/g, ''); // Remove caracteres não numéricos
        if (cep.length === 8) {
            buscarEndereco(cep);
        }
    });

    // Validação de Senhas
    document.getElementById('registration-form').addEventListener('submit', function(event) {
        const senha = document.getElementById('senha').value;
        const confirmarSenha = document.getElementById('confirmar_senha').value;

        if (senha !== confirmarSenha) {
            document.getElementById('senha-error').textContent = 'As senhas não coincidem.';
            event.preventDefault(); // Evita o envio do formulário
        } else {
            document.getElementById('senha-error').textContent = '';
        }
    });
});