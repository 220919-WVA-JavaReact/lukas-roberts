import Fact from '../fact/Fact';
import './TTAAL.css';

function TTAAL() {
    
    const facts = [
        {
            id: 1,
            fact: 'My FIDE chess rating is 2342(Master)',
            isTrue: 'lie'
        },
        {
            id: 2,
            fact: 'I threw a party that cost 150K.',
            isTrue: 'truth'
        },
        {
            id: 3,
            fact: 'I can sing up to an F5.',
            isTrue: 'truth'
        }
    ]

    return (
        <main>
            <h3>Two truth and a lie</h3>
            <table>
                {
                    facts.map( fact => (
                        <Fact id={fact.id} fact={fact.fact} isTrue={fact.isTrue} />
                    ))
                }
            </table>
        </main>
    )
}

export default TTAAL;