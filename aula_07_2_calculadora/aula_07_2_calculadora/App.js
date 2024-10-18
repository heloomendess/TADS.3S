import {Button, StyleSheet, Text, TextInput, View, ScrollView} from 'react-native';
import {useState} from "react";

const App = () => {
  const [resultado, setResultado] = useState(null);
  const [resultado1, setResultado1] = useState(null);
  const [resultado2, setResultado2] = useState(null);
  const [resultado3, setResultado3] = useState(null);

  const [operadorSoma1, setOperadorSoma1] = useState(null);
  const [operadorSoma2, setOperadorSoma2] = useState(null);

  const [operadorSub1, setOperadorSub1] = useState(null);
  const [operadorSub2, setOperadorSub2] = useState(null);

  const [operadorDiv1, setOperadorDiv1] = useState(null);
  const [operadorDiv2, setOperadorDiv2] = useState(null);

  const [operadorMulti1, setOperadorMulti1] = useState(null);
  const [operadorMulti2, setOperadorMulti2] = useState(null);


  const somar = () => {
    setResultado( parseInt(operadorSoma1) + parseInt(operadorSoma2));
  }

  const subtrair = () => {
    setResultado1( parseInt(operadorSub1) - parseInt(operadorSub2));
  }
  
  const dividir = () => {
    setResultado2( parseInt(operadorDiv1) / parseInt(operadorDiv2));
  }
  
  const multiplicar = () => {
    setResultado3( parseInt(operadorMulti1) * parseInt(operadorMulti2));
  }

  return (
    <ScrollView style={Estilos.container}>
      <Text>Digite o operador 1:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorSoma1(value)} />
      <Text>Digite o operador 2:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorSoma2(value)} />
      <Button title="Somar valores" onPress={()=>somar()} />
      <Text style={Estilos.textResultado}>Resultado da soma: {resultado}</Text>

      <Text>Digite o operador 1:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorSub1(value)} />
      <Text>Digite o operador 2:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorSub2(value)} />
      <Button title="Subtrair valores" onPress={()=>subtrair()} />
      <Text style={Estilos.textResultado}>Resultado da subtração: {resultado1}</Text>

      <Text>Digite o operador 1:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorDiv1(value)} />
      <Text>Digite o operador 2:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorDiv2(value)} />
      <Button title="Dividir valores" onPress={()=>dividir()} />
      <Text style={Estilos.textResultado}>Resultado da divisão: {resultado2}</Text>

      <Text>Digite o operador 1:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorMulti1(value)} />
      <Text>Digite o operador 2:</Text>
      <TextInput style={Estilos.textInput}
                 keyboardType = 'numeric'
                 onChangeText={(value) => setOperadorMulti2(value)} />
      <Button title="Multiplicar valores" onPress={()=>multiplicar()} />
      <Text style={Estilos.textResultado}>Resultado da multiplicação: {resultado3}</Text>
    </ScrollView>
    

  );
}

const Estilos = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  textInput:{
    margin: 5,
    borderWidth: 1,
    borderColor: '#000',
    width: 200
  },
  textResultado: {
    fontSize: 20,
    margin: 5,
    color: "blue"
  }
});

export default App;