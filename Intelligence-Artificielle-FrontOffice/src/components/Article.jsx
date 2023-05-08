const Article = ({ imgUrl, titre, description, application }) => (
    <div>
        <div className="container_article">
            <div className="article-image">
                <img src={imgUrl} alt="blog_image" />
            </div>
            <div className="article-content">
                <div>
                    <p>{titre}</p>
                    <h3>{description}</h3>
                </div>
                <p>{application}</p>
            </div>
        </div>
    </div>
);

export default Article;
