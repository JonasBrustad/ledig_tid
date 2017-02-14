import React, { Component } from 'react';
import axios from 'axios';
import './App.css';

class Book extends Component {

    constructor(props){
        super(props);

        this.state = {
            books: ''
        };
    }

    componentDidMount(){
        axios.get('http://localhost:8080/book')
            .then(function (response) {
                this.setState({books: response})
            });
    }

    render(){
        return (
            <h1>Hallo? {this.state.books}</h1>
        );
    }
}

export default Book;