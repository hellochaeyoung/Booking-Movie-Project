<template>
  <div class="main">
    <div class="head">영화 예매 사이트</div>
    <hr>
    <div class="box">
      <div class="imageitem" @click="book('클레멘타인')">
        <img src="../assets/movie1.jpg" />
        <div class="buttons">
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '클레멘타인', time: '9:00', hallNumber: 1, price: 10000}}"
            >9:00</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '클레멘타인', time: '15:00', hallNumber: 1, price: 10000}}"
            >15:00</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '클레멘타인', time: '21:00', hallNumber: 1, price: 10000}}"
            >21:00</router-link>
          </button>
        </div>
      </div>
      <div class="imageitem" @click="book('영웅')">
        <img src="../assets/movie2.jpg" />
        <div class="buttons">
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '영웅', time: '8:30', hallNumber: 2, price: 8000}}"
            >8:30</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '영웅', time: '13:30', hallNumber: 2, price: 8000}}"
            >13:30</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '영웅', time: '18:30', hallNumber: 2, price: 8000}}"
            >18:30</router-link>
          </button>
        </div>
      </div>
      <div class="imageitem" @click="book('성냥팔이 소녀의 재림')">
        <img src="../assets/movie3.jpg" />
        <div class="buttons-last">
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '성냥팔이 소녀의 재림', time: '10:00', hallNumber: 3, price: 9000}}"
            >10:00</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '성냥팔이 소녀의 재림', time: '14:00', hallNumber: 3, price: 9000}}"
            >14:00</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '성냥팔이 소녀의 재림', time: '18:00', hallNumber: 3, price: 9000}}"
            >18:00</router-link>
          </button>
          <button>
            <router-link
              :to="{name: 'select', query: {movieName: '성냥팔이 소녀의 재림', time: '22:00', hallNumber: 3, price: 9000}}"
            >22:00</router-link>
          </button>
        </div>
      </div>
    </div>

    <div class="movieInfo">
      <div v-if="isSelected">{{hallNumber}}관 [{{movieName}}] {{seatPrice}}원</div>
    </div>

    <hr />

    <form class="input-phone-number">
      예매 번호 입력
      <input type="text" v-model="phoneNumber" placeholder="010-XXXX-XXXX" />
    </form>

    <button @click = "getBookingList" class="checkButton">
      예매 확인
    </button>
  </div>
</template>

<script>
import httpBase from "../utils/httpCommons";
export default {
  data() {
    return {
      movieinfos: [],
      movieName: "",
      hallNumber: "",
      seatPrice: "",
      phoneNumber: "",
      isSelected: false,
    };
  },

  methods: {
    book(moviename) {
      httpBase.get("/movie/" + moviename).then(response => {
        this.movieName = response.data.movieName;
        this.hallNumber = response.data.hallNumber;
        this.seatPrice = response.data.seatPrice;
        this.isSelected = true;
      });
    },

    getBookingList() {

        console.log("////////");
        this.$router.push({
        name: "check",
        query: {
          phoneNumber: this.phoneNumber,
        },
      });
    }

  }
};
</script>

<style>
div {
  display: block;
}

.head {
  margin-top: 50px;
  margin-bottom: 50px;
  text-align: center;
  font-size: 30px;
  font-weight: bold;
  display: block;
}

.imageitem {
  display: inline-block;
  padding: 50px;
}

.box {
  white-space: nowrap;
  overflow: auto;
}

.buttons {
  display: flex;
  display: block;
  position: relative;
  padding: 5px 0;
  left: 20px;
  right: 100px;
  width: 50px;
  text-align: center;
  text-decoration: none;
  font-size: 10px;
  margin: 4px;
  cursor: pointer;
}

.buttons-last {
  display: flex;
  display: block;
  position: relative;
  padding: 5px 0;
  left: -10px;
  right: 100px;
  width: 50px;
  text-align: center;
  text-decoration: none;
  font-size: 10px;
  margin: 4px;
  cursor: pointer;
}

.info {
  position: relative;
  left: 21%;
  top: 100px;
}

.checkButton {
  margin: 0 10%;
  width: 10%;
}

.movieInfo {
  display: grid;
  margin-bottom: 40px;
  font-size: 20px;
  font-weight: bold;
}

.input-phone-number {
  margin-bottom: -5px;
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