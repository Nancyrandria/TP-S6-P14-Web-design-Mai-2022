import { features } from "../constants";
import styles, { layout } from "../style";
import 'boxicons';

const FeatureCard = ({ icon, title, content, index }) => (
  <div className={`flex flex-row p-6 rounded-[20px] ${index !== features.length - 1 ? "mb-6" : "mb-0"} feature-card`}>
    <div className={`w-[64px] h-[64px] rounded-full ${styles.flexCenter} bg-dimBlue`}>
      <box-icon name={icon} color='#04f6ff' ></box-icon>
    </div>
    <div className="flex-1 flex flex-col ml-3">
      <h1 className="font-poppins font-semibold text-white text-[18px] leading-[23.4px] mb-1">
        {title}
      </h1>
      <p className="font-poppins font-normal text-dimWhite text-[16px] leading-[24px]">
        {content}
      </p>
    </div>
  </div>
);

const Business = () => (
  <section id="application" className={layout.section}>
    <div className={layout.sectionInfo}>
      <h2 className={styles.heading2}>
        L'IA dans de nombreux domaines d'application
      </h2>
      <p className={`${styles.paragraph} max-w-[470px] mt-5`}>
        Elle permet d'améliorer l'efficacité, la précision et la qualité des résultats.
      </p>

    </div>

    <div className={`${layout.sectionImg} flex-col`}>
      {features.map((feature, index) => (
        <FeatureCard key={feature.id} {...feature} index={index} />
      ))}
    </div>
  </section>
);

export default Business;
