import './Hero.css';
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCirclePlay } from '@fortawesome/free-solid-svg-icons';
import { Link, useNavigate } from 'react-router-dom';
import Button from 'react-bootstrap/Button';

const Hero = ({ movies }) => {
    // Add a check to handle undefined or empty movies array
    if (!movies || movies.length === 0) {
        return <div>Loading...</div>; // Or any other placeholder or loading indicator
    }

    const navigate = useNavigate();

    function reviews(movieId)
    {
        navigate(`/Reviews/${movieId}`);
    }

  return (
    <div className='movie-carousel-container'>
        <Carousel>
            {
                movies.map((movie) => { // map each item in movies array to item displayed in the carousel
                    return(
                        <Paper key={movie.id}>
                            <div className='movie-card-container'>
                                <div className='movie-card' style={{"--img": movie.backdrops && movie.backdrops.length > 0 ? `url(${movie.backdrops[0]})` : 'none'}} > 
                                    <div className='movie-detail'>
                                        <div className='movie-poster'>
                                            <img src={movie.poster} alt='' />
                                        </div>
                                        
                                        <div className='movie-title'>
                                            <h4>{movie.title}</h4>
                                        </div>
                                        
                                        <div className='movie-buttons-container'>
                                            <Link to={movie.trailerLink && `/Trailer/${movie.trailerLink.substring(movie.trailerLink.length - 11)}`}>
                                                <div className='play-button-icon-container'>
                                                {movie.trailerLink && (
                                                <FontAwesomeIcon 
                                                        className='play-button-icon'
                                                        icon={faCirclePlay}
                                                    />
                                                )}
                                                </div>
                                            </Link>
                                        
                                        <div className='movie-review-button-container'>
                                            <Button variant='info' onClick={() => reviews(movie.imdbId)} >Reviews</Button>
                                        </div>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </Paper> // encapsulates each movie item displayed
                    )
                }) 
            }
        </Carousel>
    </div>
  )
}

export default Hero