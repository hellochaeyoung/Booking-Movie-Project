import Vue from 'vue';
import VueRouter from 'vue-router';


import main from '@/components/main';
import select from '@/components/select';
import finish from '@/components/finish';
import check from '@/components/check';

Vue.use(VueRouter);
const routes = [
  { path: "/", name: "main", component: main },
  { path: "/select", name: "select", component: select },
  { path: "/finish", name: "finish", component: finish },
  { path: "/check", name: "check", component: check },
];
const router = new VueRouter({
  mode: "history",
  routes,
});

export default router;
