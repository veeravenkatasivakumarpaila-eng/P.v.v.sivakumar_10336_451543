import { useState } from "react";
import { languages,genres,formats } from "../Utils/FiltersData";
import HeaderComponent from "./HeaderComponent";
import MovieGridComponent from "./MovieGridComponent";
import { movies } from "/Utils/MoviesData";

const BodyComponent = () => {

  //https://www.justickets.in/visakhapatnam
//https://data.justickets.co/datapax/JUSTICKETS.visakhapatnam.v1.json
//https://s3-ap-southeast-1.amazonaws.com/slydes-assets/datapax/screens.JUSTKT.v1.json
 //https://data.justickets.co/datapax/visakhapatnam.featured_content.json
 //https://www.justickets.in/language.json
 //https://data.justickets.co/datapax/comingsoon.v2.json


  //const searchTxt="";
  const [searchText,setSearchText]=useState("");
  // const [ListOfMovies,setListOfMovies] = useState(movies);
   const [ListOfMovies,setListOfMovies] = useState([]);
  const [filteredMovieList,setFilteredMovieList] = useState([]);
   const [dataFetched, setDataFetched] = useState(false);

if (!dataFetched) {
  const fetchData = async () => {
    const response = await fetch(
     " https://data.justickets.co/datapax/JUSTICKETS.visakhapatnam.v1.json"
     // "https://api.themoviedb.org/3/movie/popular?api_key=c45a857c193f6302f2b5061c3b85e743&language=en-US&page=1"
    );
    const jsonData = await response.json();
    setListOfMovies(jsonData.movies);
    console.log(jsonData.movies);
    setFilteredMovieList(jsonData.movies);
  };
  fetchData();
  setDataFetched(true);
}


  // Function to render selected filters dynamically
  const renderSelectedFilters = () => {
    const selected = [];
    document.querySelectorAll(".filter-checkbox").forEach((cb) => {
      if (cb.checked) selected.push(cb.value);
    });

    const container = document.getElementById("filteredOptions");
    container.innerHTML = selected
      .map((f) => `<span class="filter-chip">${f}</span>`)
      .join("");
  };

  // Attach click listeners directly in render using onClick
  const createCheckbox = (value) => (
    <label key={value}>
      <input
        type="checkbox"
        value={value}
        className="filter-checkbox"
        onClick={renderSelectedFilters}
      />{" "}
      {value}
    </label>
  );

  return (
    <>
       
    <div className="movie-header">
  <button 
    className="section-title"
    onClick={() => {
      // Handle "Now Showing" click, e.g., filter movies
      console.log("Now Showing clicked");
    }}
  >
    Now Showing
  </button>

  <button 
    className="coming-soon"
    onClick={() => {
      // Handle "Coming Soon" click, e.g., filter upcoming movies
      console.log("Coming Soon clicked");
    }}
  >
    Coming Soon
  </button>
</div>


      {/* <div className="movie-header">
        <a href="#" className="section-title">Now Showing</a>
        <a href="#" className="coming-soon">Coming Soon</a>
      </div> */}

      <div className="filter-row">
        <div className="filter-dropdown">
          <div className="filter-btn">
            Filter ▼
            <div className="filter-content">
              <div className="filter-group">
                <p className="filter-title">Languages</p>
                {languages.map(createCheckbox)}
              </div>

              <div className="filter-group">
                <p className="filter-title">Genres</p>
                {genres.map(createCheckbox)}
              </div>

              <div className="filter-group">
                <p className="filter-title">Format</p>
               {formats.map(createCheckbox)}
              </div>
            </div>
          </div>
        </div>

        <div className="filtered-options" id="filteredOptions"></div>
      </div>

        <div className="search-bar">
          <input 
          type="text" 
          id="searchText-id" 
          value={searchText} 
          placeholder="Search for movies, theatres..."
          onChange={(e)=>{
            setSearchText(e.target.value);
        //  var temp=document.getElementById("searchText-id").value;
        // setSearchText(temp);
         //  console.log(temp);
          }}
          />
          <button className="search-btn" onClick={(e)=>{
           // console.log({movies});
           // setListOfMovies(movies);
            console.log(ListOfMovies);
          const filterMovies = ListOfMovies.filter((movie)=>
             movie.name.toLowerCase().includes(searchText.toLowerCase())
        );
          
              setFilteredMovieList(filterMovies);
             // console.log(filteredMovieList);
          }}
          >Search</button>
        </div>

      {/* MovieGridComponent*/}
      <MovieGridComponent movies={filteredMovieList.length ? filteredMovieList : ListOfMovies}/>
    </>
  );
};

export default BodyComponent;
