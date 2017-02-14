import React, { Component } from 'react';

class Book extends Component {
    render(){
        return (
            <tr>
                <td>{this.props.book.title}</td>
                <td>{this.props.book.genre}</td>
            </tr>
        )
    }
}

export default Book;