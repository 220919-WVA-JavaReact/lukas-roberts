import React, { Component } from 'react';

interface IFactProps {
    id: number,
    fact: string,
    isTrue: string
}

class Fact extends Component<IFactProps> {
    render() {
        return (
            <tr className={this.props.isTrue}>
                <th>{this.props.id}</th>
                <td>{this.props.fact}</td>
            </tr>
        );
    }
}

export default Fact;