# Aula 4 — Java Evolução da Linguagem

## Passo 1: o prompt do tradutor de eras

<img width="1326" height="851" alt="STEP1_Prompt_chatGpt" src="https://github.com/user-attachments/assets/284bdb90-19f7-4646-a7f5-9d64f75573ec" />

## Passo 2: o desafio socrático

<img width="1327" height="906" alt="STEP2_Prompt_chatGpt" src="https://github.com/user-attachments/assets/90136b6a-d866-4d03-b339-dd244b05aced" />

## Passo 3: validação na IDE (ambiente de desenvolvimento integrado)

Meu código executando: <img width="1917" height="1012" alt="image" src="https://github.com/user-attachments/assets/eaff2556-ee6b-4a8d-9053-e42f49865dbe" />
Código ChatGpt executando: <img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/1faf177e-3f1b-4e01-8d14-f8a89a4bb05a" />

Código ChatGPT com o Optional de seguro ativo, seguindo as instruções do ChatGPT:


As conversas com o chat estão anexadas nesse REPO.


## Entregável

Código modernizado: o trecho final em Java 21, utilizando as ferramentas aprendidas anteriormente no curso.

JAVA21 - Código pessoal construído sem o ChatGPT - demorou 1 dia para construir, corrigir os erros e buscar as atualizações nas libs e docs.

```
    List<String> getMotoristasCnhAtiva() {

        List<Motorista> motoristas = getMotoristasDaEmpresa();
        List<String> habilitados;

        Stream<Motorista> motStream = motoristas.stream();

        // Filtrando motoristas com CHN ativa e ordenando por tempo de casa (anos)
        // usando Comparator anônimo
        habilitados = motStream.filter(Motorista::isChnAtiva)
                .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
                .map(Motorista::getNome)
                .toList();

        return habilitados;
    }
```

JAVA21 - Código modernizado pelo ChatGPT - demorou 5 minutos.

```
List<Motorista> habilitados = getMotoristasDaEmpresa().stream()
        .filter(Motorista::isChnAtiva)
        .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
        .toList();
```

JAVA21 - Código modernizado pelo ChatGPT com a alteração do Optional de seguro ativo escrito por mim seguindo os direcionamentos do Chat.








