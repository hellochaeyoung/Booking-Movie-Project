<template>
  <div>
    <div class="input">
        <h1>{{phoneNumber}}의 예매 이력</h1>
        <hr>
      <table class = "tableStyle">
        <thead>
          <th>상영작</th>
          <th>상영관</th>
          <th>상영시간</th>
          <th>인원 수</th>
          <th>좌석</th>
          <th>총 가격</th>
        </thead>

        <tbody>
          <tr v-for="(data, index) in bookingInfo" :key="index">
            <td>{{data.movieName}}</td>
            <td>{{data.hallNumber}}</td>
            <td>{{data.time}}</td>
            <td>{{data.people}}</td>
            <td>{{data.seatNumber}}</td>
            <td>{{data.prices}}</td>
          </tr>
        </tbody>
      </table>

      <button class="button-style">
        <router-link
              :to="{name: 'main'}"
            >HOME</router-link>
    </button>
    </div>
  </div>
</template>

<script>
import httpBase from "../utils/httpCommons";

export default {
  data() {
    return {
      bookingInfo: [],
      phone: "",
      movieName: "",
      time: "",
      people: "",
      seatNumber: "",
      prices: "",
      hallNumber: "",

      phoneNumber: "",

      count: 0
    };
  },

  mounted() {
    this.phoneNumber = this.$route.query.phoneNumber;
    console.log(this.phoneNumber);
    httpBase
      .get("/movie/check/" + encodeURI(this.phoneNumber))
      .then(response => {
        this.bookingInfo = response.data;
      });
  },

  methods: {}
};
</script>

<style>
.numberTitle {
  font-size: 20px;
  font-weight: bold;
}

.checkButton {
  margin-top: 30px;
  margin-bottom: 30px;
}

.tableStyle {
    border-spacing: 0;
    margin: 0 auto;
    border-left: 1px solid black;
    border-top: 1px solid black;
    margin-top: 100px;
}
.tableStyle td,
.tableStyle th {
    border-right : 1px solid black;
    border-bottom : 1px solid black;
    padding: 1rem;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>