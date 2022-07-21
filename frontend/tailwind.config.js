/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],

  important: '#root',

  theme: {
    extend: {
      backgroundImage:{
        'hero-pattern':"url('assets/img/cover/car_04.jpg')",
        'loginAdmin-img': "url('assets/img/cover/car_02.jpg')",
        'loginDriver-img': "url('assets/img/cover/car_03.jpg')"
      },
      fontFamily:{
        'dosis':"'Dosis',sans-serif",
        'roboto':"'Roboto Condensed', sans-serif",
      },
    },
  },
  plugins: [],
}
