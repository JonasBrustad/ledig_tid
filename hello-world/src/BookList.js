import React, { Component } from 'react';
import Book from './Book';

class BookList extends Component {
    render(){
        var books = this.props.books.map(book => <Book key={book.title} book={book}/>);

        return (
            <table>
                <tbody>
                <tr>
                    <th>Title</th>
                    <th>Genre</th>
                </tr>
                {books}
                </tbody>
            </table>
        )

    }
}

export default BookList;