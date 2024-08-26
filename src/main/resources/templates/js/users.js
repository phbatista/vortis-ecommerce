document.addEventListener('DOMContentLoaded', function() {
    // Dados de exemplo de usuários
    const usuarios = [
        {
            id: 1,
            nome: 'João Silva',
            email: 'joao.silva@example.com',
            telefone: '(11) 91234-5678'
        },
        {
            id: 2,
            nome: 'Maria Oliveira',
            email: 'maria.oliveira@example.com',
            telefone: '(21) 98765-4321'
        },
        {
            id: 3,
            nome: 'Pedro Santos',
            email: 'pedro.santos@example.com',
            telefone: '(31) 99876-5432'
        }
    ];

    // Função para carregar usuários (usando dados de exemplo)
    function carregarUsuarios() {
        const tabelaCorpo = document.getElementById('users-table-body');
        tabelaCorpo.innerHTML = ''; // Limpa a tabela existente

        usuarios.forEach(usuario => {
            const tr = document.createElement('tr');

            tr.innerHTML = `
                <td>${usuario.id}</td>
                <td>${usuario.nome}</td>
                <td>${usuario.email}</td>
                <td>${usuario.telefone}</td>
                <td>
                    <button onclick="editarUsuario(${usuario.id})">Editar</button>
                    <button onclick="excluirUsuario(${usuario.id})">Excluir</button>
                </td>
            `;

            tabelaCorpo.appendChild(tr);
        });
    }

    // Função para editar um usuário
    window.editarUsuario = function(id) {
        // Exemplo de ação de edição (pode ser substituído por redirecionamento ou modal)
        alert(`Editar usuário com ID ${id}`);
    }

    // Função para excluir um usuário
    window.excluirUsuario = function(id) {
        if (confirm('Tem certeza que deseja excluir este usuário?')) {
            // Exemplo de ação de exclusão (remover do array de exemplo)
            const index = usuarios.findIndex(usuario => usuario.id === id);
            if (index > -1) {
                usuarios.splice(index, 1);
                carregarUsuarios(); // Recarrega a lista de usuários
            } else {
                alert('Usuário não encontrado.');
            }
        }
    }

    // Carrega os usuários quando a página é carregada
    carregarUsuarios();
});