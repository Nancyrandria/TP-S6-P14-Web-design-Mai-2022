import styles from "../style";
import FeedbackCard from "./FeedbackCard";
import { useState, useEffect } from 'react';
import axios from "axios";

const Testimonials = () => {
  const [feedback, setfeedBack] = useState([]);
  useEffect(() => {
    const getFeedBack = async () => {
      let res = await axios.get(`https://intelligence-artificielle-api.up.railway.app/temoignage/listetemoignage`);
      let newFeedBack = await res.data.slice(0, 3);
      setfeedBack(newFeedBack);
    };
    getFeedBack();
  }, []);
  return (
    <section id="temoignages" className={`${styles.paddingY} ${styles.flexCenter} flex-col relative `}>
      <div className="absolute z-[0] w-[60%] h-[60%] -right-[50%] rounded-full blue__gradient bottom-40" />

      <div className="w-full flex text-center items-center md:flex-row flex-col relative z-[1]">
        <h2 className={styles.heading2}>
          Témoignages
        </h2>
      </div>

      <div className="flex flex-wrap justify-center w-full feedback-container relative z-[1]">
        {feedback.map((card) => <FeedbackCard key={card.idtemoignage} auteur={card.auteur} commentaire={card.commentaire} />)}
      </div>
    </section>
  )
};

export default Testimonials;
