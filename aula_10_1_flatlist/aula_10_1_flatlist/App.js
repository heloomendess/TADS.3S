import React from 'react';
import {SafeAreaView, StyleSheet, Text, View, FlatList, Pressable, Image} from 'react-native';

const App = () => {
    const DATA = [ // QUANDO COMEÇAMOS COM UMA CHAVE É UM VETOR NO NOSSO CASO É UM VETOR DE OBJETOS
        {
            "id": 1009220,
            "nome": "Captain America (Americano)",
            "descricao": "Vowing to serve his country any way he could, young Steve Rogers took the super soldier serum to become America's one-man army. Fighting for the red, white and blue for over 60 years, Captain America is the living, breathing symbol of freedom and liberty.",
            "dataModificacao": "2020-04-04T19:01:59-0400",
            "imagem": "https://www.otempo.com.br/content/dam/otempo/editorias/entretenimento/filmes-e-series/2023/7/entretenimento-escudo-do-capitao-america-tem-proposito-secreto-que-nem-ele-sabia-1708767121.jpeg",
            "empresa": "Stark"
        },
        {
            "id": 1010914,
            "nome": "Captain America (House of M) Teste",
            "descricao": "",
            "dataModificacao": "2014-03-05T13:17:50-0500",
            "imagem": "https://i.ebayimg.com/images/g/vAoAAOSwHCBh-onx/s-l1200.jpg",
            "empresa": "Marvel"
        },
        {
            "id": 1017295,
            "nome": "Captain America (LEGO Marvel Super Heroes)",
            "descricao": "",
            "dataModificacao": "2013-09-18T11:15:29-0400",
            "imagem": "https://www.lego.com/cdn/cs/set/assets/bltb111811e2f998fad/76168.jpg?fit=bounds&format=jpg&quality=80&width=1500&height=1500&dpr=1",
            "empresa": "Lego"
        },
        {
            "id": 1017299,
            "nome": "Cap. America",
            "descricao": "Esse é um novo item na lista",
            "dataModificacao": "2013-09-18T11:15:29-0400",
            "imagem": "https://assetsio.gnwcdn.com/chris-evans-podera-deixar-o-papel-de-capitao-america-148966575502.jpg?width=1200&height=1200&fit=bounds&quality=70&format=jpg&auto=webp",
            "empresa": "Marvel"
        },        
        {
            "id": 1017575,
            "nome": "Captain America (Sam Wilson)",
            "descricao": "Sam Wilson, a Harlem native, previously operated under the name Falcon, fighting alongside the Avengers. When his longtime friend Steve Rogers stepped down as Captain America, Wilson was hand-picked to fill the role. Now the former Falcon soars through the skies wearing red, white and blue.",
            "dataModificacao": "2014-11-17T17:46:57-0500",
            "imagem": "https://d2d7ho1ae66ldi.cloudfront.net/ArquivoNoticias/52af4c55-f3fb-11ed-aa6e-9587410378a2/capitao-america-4-sam-wilson-anthony-mackie-novo-uniforme.jpg",
            "empresa": "Marvel"
        },
        {
            "id": 101723,
            "nome": "Boneco do Capitão America",
            "descricao": "",
            "dataModificacao": "2014-11-17T17:46:57-0500",
            "imagem": "https://66703.cdn.simplo7.net/static/66703/sku/action-figures-marvel-legends-boneco-articulado-marvel-legends-capitao-america-retro-captain-america--p-1713541602116.jpg",
            "empresa": "Mattel"
        },
        {
            "id": 101744,
            "nome": "Capitão America Zombie",
            "descricao": "",
            "dataModificacao": "2014-11-17T17:46:57-0500",
            "imagem": "https://static0.gamerantimages.com/wordpress/wp-content/uploads/2021/09/Zombie-Captain-America-in-Marvels-What-If.jpg",
            "empresa": "What If"
        },
        {
            "id": 101744,
            "nome": "Capitã Carter",
            "descricao": "",
            "dataModificacao": "2014-11-17T17:46:57-0500",
            "imagem": "https://platform.polygon.com/wp-content/uploads/sites/2/chorus/uploads/chorus_asset/file/22776200/101_AGA0230_comp_v904_20201218_r709.00001220.jpg?quality=90&strip=all&crop=17.946428571429,0,64.107142857143,100",
            "empresa": "What If"
        },
    ]

    {/*
    PRESSABLE - TORNAR OS COMPONENTE PRESSIONAVEIS NA TELA QUE ESTÃO ABAIXO DELE
    ITEM - REPRESENTA CADA POSIÇÃO DENTRO DO MEU VETOR DA VARIAVEL "DATA" QUE FOI EXIBIDO NA LINHA 5
    */}
    const Personagem = ({item}) => (
        <Pressable onPress={() => alert(item.descricao === "" ? "Personagem sem descrição" : item.descricao)}> 
            <View style={styles.containerPersonagem}>
                <Image
                    style={styles.tinyLogo}
                    source={{
                        uri: item.imagem,
                    }}
                />
                <Text style={styles.paragraph}>{item.nome}</Text>
                <Text style={styles.paragraph}>{item.empresa ? item.empresa : "Sem empresa"}</Text>
            </View>
        </Pressable>
    );

    return (
        <SafeAreaView style={styles.container}>
            <FlatList //componente de lista
                data={DATA} // DADOS DA LISTA É A VARIAVEL "DATA"
                renderItem={Personagem} // COMO CADA ITEM SERÁ EXIBIDO NA TELA É UMA FUNÇÃO JS "Personagem"
                keyExtractor={item => item.id} //identificador unico
                horizontal={false} //TORNA A LISTA NA HORIZONTAL
            />
        </SafeAreaView>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#0077b6',
        padding: 8
    },
    containerPersonagem: {
        flex: 1,
        justifyContent: 'center',
        backgroundColor: '#caf0f8',
        padding: 10,
        borderRadius: 10,
        borderWidth: 2,
        borderColor: 'black',
        width: 300,
        height: 300
    },
    paragraph: {
        margin: 12,
        padding: 10,
        fontSize: 14,
        color: 'white',
        fontWeight: 'bold',
        textAlign: 'center',
        backgroundColor: '#03045e',
    },
    tinyLogo: {
        width: 150,
        height: 200,
        alignSelf: 'center',
    },
});

export default App;
