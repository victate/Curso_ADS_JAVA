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

### Código modernizado: o trecho final em Java 21, utilizando as ferramentas aprendidas anteriormente no curso.

JAVA21 - [Código pessoal construído sem o ChatGPT](https://github.com/victate/Curso_ADS_JAVA/tree/main/motorista) - demorou 1 dia para construir, corrigir os erros e buscar as atualizações nas libs e docs.

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

JAVA21 - [Código modernizado pelo ChatGPT com a alteração do Optional de seguro ativo escrito por mim seguindo os direcionamentos do Chat.](https://github.com/victate/Curso_ADS_JAVA/tree/main/motorista_ChatGPT)

```
List<Motorista> getMotoristasCnhAtiva() {

    List<Motorista> habilitados = getMotoristasDaEmpresa().stream()
            .filter(Motorista::isChnAtiva)
            .filter(Motorista::isSeguroPresente)
            .filter(Motorista::isSeguroAtivo)
            .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
            .toList();

    return habilitados;
}
```

Código com Optional compilando
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/817fb0ea-e8b1-437a-8627-c63217de4699" />

### Relato do aprendizado: uma breve explicação (de 3 a 5 linhas) sobre o insight mais importante que a IA proporcionou durante a explicação do porquê da mudança.

Normalmente eu já utilizo a IA como um professor quando estou desenvolvendo estudos autodidatas. Umas das principais difereças para mim que impactou o estudo solo é o fato de correção de exercícios e aexplicação compilado do porque do erro. Quando estudo sozinha, às vezes o professor passa apenas o exercício e a resposta final, nem a resposta final, às vezes, e é ainda que a IA entra para mim. Nesse exercício, utilizei o ChatGPT com quem estou familiarizada, mas em outros momentos, uso o Copilot conectado diretamente ao Github e VScode. Gosto porque consigo compreender os conceitos e a solução de uma maneira mais rápida e aprofundada. Normalmente, quando eu procurava pelo Google (antes de ter a função de IA nas respostas) eu achava diversas possíveis soluções que podiam funcionar ou não, dependendo de toda a configuração e versionamento das libs utilizadas. Gastava horas e nem sabia se funcionaria e, quando funcionava, ficava aquela pergunta - Ok, funcionou. Mas, por que funcionou? Sinto que isso não ocorre mais e consigo fazer em muito menos tempo, definindo exatamente as configurações do meu workspace, a busca e compreensão se tornam bem mais rápidas.

Eu não conhecia a função de Stream, então, como apontado anteriormente no código que fiz sozinha primeiro, demorei por volta de 1 dia apenas para gerar o código sem Optional. Com a orientação do chat, levei apenas algumas horas para implementar o Optional considerando os objetos, gets e setters.

### Prompt de desafio: a captura de tela ou o texto do prompt que você usou para desafiar a IA.

<img width="1055" height="766" alt="image" src="https://github.com/user-attachments/assets/354dd309-5fe7-4a60-a235-a57d2b1056a8" />

<img width="1037" height="812" alt="image" src="https://github.com/user-attachments/assets/99d16115-2528-4102-a986-d73e79ff1d6f" />

<img width="1042" height="832" alt="image" src="https://github.com/user-attachments/assets/8ebdeb2b-1003-46d4-8164-cdb066e532cb" />


- [Conversas exportadas com o chatGPT](https://github.com/victate/Curso_ADS_JAVA/tree/main/AULA_4_JAVA)
- [Projeto com código chatGPT e adição minha do Optional seguindo as diretrizes do chat](https://github.com/victate/Curso_ADS_JAVA/tree/main/motorista_ChatGPT)

<img width="1917" height="1072" alt="image" src="https://github.com/user-attachments/assets/c5b4aa36-d58f-4ef1-ad93-77ac6b094dca" />
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/f04cfe74-6e1b-49b9-81d4-02b93446a2ec" />
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/41058e43-198c-401b-992c-561b6827f708" />
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/c822c93f-ddc3-429b-a5b6-4669a7158691" />
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/f1567f99-be02-4f78-b573-de162c6dcca3" />

    







