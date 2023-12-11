/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/main/resources/templates/**/*.html"
  ],
  theme: {
    extend: {
        colors: {
            'fundo': '#F7F7F7',
            'fundo-dark': '#001449',
            'amarelo-pastel': '#f8f8ec',
            'azul-claro': '#066699',
            'azul-mediano': '#0a5483',
            'azul-escuro': '#02416d',
        },
    },
  },
  plugins: [],
}

