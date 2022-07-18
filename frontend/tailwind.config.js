/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],

  important: '#root',

  theme: {
    extend: {
      backgroundImage:{
        'hero-pattern':"url('assets/img/cover/car_03.jpg')"
      }
    },
  },
  plugins: [],
}
