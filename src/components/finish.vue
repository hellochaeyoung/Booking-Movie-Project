<template>
  <div>
    <h1>{{$route.query.phoneNumber}} 님의 예매 내역</h1>

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
        <tr>
          <td>{{$route.query.movieName}}</td>
          <td>{{$route.query.hallNumber}}</td>
          <td>{{$route.query.time}}</td>
          <td>{{$route.query.people}}</td>
          <td>{{$route.query.seatNumber}}</td>
          <td>{{$route.query.prices}}</td>
        </tr>
      </tbody>
    </table>

    <button class="button-style">
        <router-link
              :to="{name: 'main'}"
            >HOME</router-link>
    </button>
  </div>
</template>

<script>
//import httpBase from "../utils/httpCommons";
export default {
  data() {
    return {
      customerId: "",
      phoneNumber: "",
      movieName: "",
      time: "",
      people: 0,
      seatNumber: "",
      prices: 0,
      hallNumber: 0
    };
  },

  created() {
    this.phoneNumber = this.$route.query.phoneNumber;
    //this.showInfo();
  },

  methods: {
    /*
    showInfo() {
      //http://localhost:8080/api/movie/%EC%98%81%EC%9B%85
      httpBase
        .get("/movie/finish?phoneNumber=" + this.phoneNumber)
        .then(response => {
            console.log("///////////////")
            this.phoneNumber = response.data.customerId,
            this.movieName = response.data.movieName,
            this.time = response.data.time,
            this.people = response.data.people,
            this.seatNumber = response.data.seatNumber,
            this.prices = response.data.seatNumber,
            this.hallNumber = response.data.hallNumber
        });
    },*/
  }
};
</script>

<style>

.tableStyle {
    border-spacing: 0;
    margin: 0 auto;
    border-left: 1px solid black;
    border-top: 1px solid black;
    margin-top: 30px;
}
.tableStyle td,
.tableStyle th {
    border-right : 1px solid black;
    border-bottom : 1px solid black;
    padding: 1rem;
}

.button-style {
    margin: 0 auto;
    margin-top: 30px;
    font-size: 25px;
}
</style>