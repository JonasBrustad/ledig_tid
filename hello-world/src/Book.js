import React, { Component } from 'react';

class Book extends Component {
    render(){
        return (
            <tr>
                <th>{this.props.book.title}</th>
                <th>{this.props.book.genre}</th>
            </tr>
        )
    }
}

export default Book;