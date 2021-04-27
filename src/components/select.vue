<template>
  <div>
    <h1>{{$route.query.movieName}}</h1>
    <h2>{{$route.query.time}}</h2>
    <h5>{{this.restSeats}}/{{this.totalSeats}}</h5>
    <div>좌석번호 [{{seatsInfo}}]</div>

    <form class="phoneForm">
      전화번호(예매번호) :
      <input type="text" v-model="phoneNumber" />
    </form>

    

    <button @click="finish">
        확인
     </button>

    <table class="table">
      <thead>
        <tr>
          <th class="result_text" align="text-center" colspan="4"></th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(i, idx) in rows" :key="idx">
          <td v-for="(j, idx) in cols" :key="idx">
            <button
              @click="test(String(i) + String(j))"
              v-bind:id="i + j"
              v-bind:ref="i + j"
              :disabled="false"
            >{{ i }}{{ j }}</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import httpBase from "../utils/httpCommons";
export default {
  data() {
    return {
      seatsInfo: "",
      movieName: "",
      time: "",
      restSeats: 0,
      totalSeats: 0,
      rows: 0,
      cols: 0,
      hallNumber: 0,
      price: 0,
      prices: 0,
      people: 0,
      phoneNumber: ""
    };
  },

  created() {
    this.movieName = this.$route.query.movieName;
    this.time = this.$route.query.time;
    this.hallNumber = this.$route.query.hallNumber;
    this.price = this.$route.query.price;
    this.getSeatsInfo();
  },

  methods: {
    getSeatsInfo() {
      //http://localhost:8080/api/movie/%EC%98%81%EC%9B%85
      httpBase
        .get("/movie/seat?movieName=" + this.movieName + "&time=" + this.time)
        .then(response => {
          this.restSeats = response.data.restSeats;
          console.log(this.restSeats);
          this.totalSeats = response.data.totalSeats;
          this.rows = response.data.rows;
          this.cols = response.data.cols;
        });
    },

    //예매 정보 insert, 확인 버튼 누르면
    finish() {
      this.prices = this.price * this.people;////////////
      console.log(this.prices);
      httpBase
        .post("/movie/finish", null, {
          params: {
            movieName: this.movieName,
            phoneNumber: this.phoneNumber,
            time: this.time,
            people: this.people,
            seatNumber: this.seatsInfo,
            prices: this.prices,
            hallNumber: this.hallNumber
          }
        })
        .then(response => {
          console.log(response);
        });

        //update rest seats
      httpBase
        .put("/movie/finish?restSeats=" + this.restSeats + "&time=" + this.time)
        .then(response => {
          console.log(response);
        });
//    <router-link :to="{name: 'finish', query: {phoneNumber : phoneNumber, movieName: movieName, time: time, people: people, seatNumber: seatNumber, prices: prices, hallNumber: hallNumber}}">확인</router-link>
  
        this.$router.push({
        name: "finish",
        query: {
          phoneNumber: this.phoneNumber,
          movieName: this.movieName,
          time: this.time,
          people: this.people,
          seatNumber: this.seatsInfo,
          prices: this.prices,
          hallNumber: this.hallNumber,
        },
      });
    },

    test(seatNum) {
      console.log(seatNum);
      this.seatsInfo = this.seatsInfo + " " + seatNum;
      this.people++;
      this.restSeats--;
      console.log(this.seatsInfo);
      console.log(this.people);
    }
  }
};
</script>

<style>
.phoneForm {
  margin-bottom: 20px;
  margin-top: 20px;
}

.table {
    margin-left: 32%;
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