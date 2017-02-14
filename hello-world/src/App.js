import React, { Component } from 'react';
import axios from 'axios';
import BookList from './BookList';
import './App.css';

class App extends Component {

    constructor(props){
        super(props);

        this.state = {
            books: []
        };
    }

    componentDidMount(){
        var self = this;
        axios.get('http://localhost:8080/book')
            .then(function (response) {
                console.log(response.data);
                console.log(response.status);
                console.log(response.statusText);
                console.log(response.headers);
                console.log(response.config);

                self.setState({
                    books: response.data
                });
            })
            .catch(function(error){
                console.log(error);
            });
    }

    render(){
        return (
            <BookList books={this.state.books}/>
        );
    }
}

export default App