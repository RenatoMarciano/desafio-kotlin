# desafio-kotlin
Bootcamp - Kotlin Experience DIO
### Suas Primeiras Condições em Kotlin

#### Desafio
##### 1 / 1 - Média Final do Aluno

Faça um programa que receba
<OL>
<LI> Caso a média seja < 5 imprima "REP";</LI>
<LI> Caso a média seja >= 5 e < 7 imprima "REC";</LI>
<LI>Caso a média seja >7 imprima "APR".</LI>
</OL>

#### Entrada
A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno. Conforme mostrado no exemplo de entrada a seguir.

#### Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra "Reprovado" caso sua média seja < 5, "Recuperação" caso sua média seja >= 5 e < 7 e "Aprovado" caso a média seja > 7. Use o exemplo abaixo para clarear o que está sendo pedido.

<table border="1">
    <tr>
        <td>Exemplos de Entrada</td>
        <td>Exemplos de Saída</td>
    </tr>
    <tr>
        <td>5.5</td>
        <td>REC</td>
    </tr>
    <tr>
        <td>8</td>
        <td>APR</td>
    </tr>
     <tr>
        <td>2</td>
        <td>REP</td>
    </tr>
</table>

<hr>

### Avançando Tecnicamente Com a Expressão When

#### Desafio
##### 1 / 1 - Data por Extenso

Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

#### Entrada
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

#### Saida
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

<table border="1">
    <tr>
        <td>Exemplos de Entrada</td>
        <td>Exemplos de Saída</td>
    </tr>
    <tr>
        <td>19/10/1997</td>
        <td>19 de Outubro de 1997</td>
    </tr>
    <tr>
        <td>25/12/2019</td>
        <td>25 de Dezembro de 2019</td>
    </tr>
     <tr>
        <td>02/02/2020</td>
        <td>02 de Fevereiro de 2020</td>
    </tr>
</table>

<hr>

### Explorando Mapas, Loops e Regras com Kotlin

#### Desafio
##### 1 / 1 - Numeral Romano

Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M. Cada um com seu respectivo valor: 

I : 1 <br>
V : 5 <br>
X : 10 <br>
L : 50 <br>
C : 100 <br>
D : 500 <br>
M : 1000 <br>

Eles são geralmente escritos do maior para o menor. Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.

#### Entrada
Você receberá uma entrada em numeral romano.

#### Saida
Você deverá imprimir o numeral romano convertido para um número inteiro.

<table border="1">
    <tr>
        <td>Exemplos de Entrada</td>
        <td>Exemplos de Saída</td>
    </tr>
    <tr>
        <td>"V"</td>
        <td>5</td>
    </tr>
    <tr>
        <td>"II"</td>
        <td>2</td>
    </tr>
     <tr>
        <td>MCII</td>
        <td>1102</td>
    </tr>
</table>

<hr>

### Utilizando a Keyword Object com Orientação a Objetos (OO)

#### Desafio
##### 1 / 1 - Cálculo Salarial

Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.

Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios.
O salário a ser transferido é calculado da seguinte maneira: 

#### (valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios

Para calcular o <b>percentual de imposto</b> segue as aliquotas:

    De R$ 0.00 a R$ 1100.00 = 5.00%
    De R$ 1100.01 a R$ 2500.00 = 10.00%
    Maior que R$ 2500.00 = 15.00%

#### Entrada
A entrada consiste em vários arquivos de teste, que conterá o <b>valor bruto do salário e adicional dos benefícios.</b> Conforme mostrado no exemplo de entrada a seguir.

#### Saida
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salárial somado com o adicional dos benefícios. Use o exemplo abaixo para clarear o que está sendo pedido.

<table border="1">
    <tr>
        <td>Exemplos de Entrada</td>
        <td>Exemplos de Saída</td>
    </tr>
    <tr>
        <td>2000</td>
        <td>2050.00</td>
    </tr>
    <tr>
        <td>250</td>
    </tr>
</table>

<hr>

### Orientação a Objetos (OO) Visando Soluções Mais Idiomáticas

#### Desafio
##### 1 / 1 - Taxa de Crescimento

Supondo que a população de um país A tenha N habitantes com uma taxa anual de crescimento de 3% e que a população de B M habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

Obs: O valor inicial da população A deverá ser sempre menor que do país B

#### Entrada
A entrada consiste em dois valores inteiros, sendo N a população do país A e M a população do país B.

#### Saida
A saída consiste em retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B, mantidas as taxas de crescimento. Confira exemplo abaixo:

### Exemplo 1

<table border="1">
    <tr>
        <td>Entrada</td>
        <td>Saída</td>
    </tr>
    <tr>
        <td>80000</td>
        <td>16 anos</td>
    </tr>
    <tr>
        <td>100000</td>
    </tr>
</table>


### Exemplo 2

<table border="1">
    <tr>
        <td>Entrada</td>
        <td>Saída</td>
    </tr>
    <tr>
        <td>100000</td>
        <td>48 anos</td>
    </tr>
    <tr>
        <td>200000</td>
    </tr>
</table>

<hr>
