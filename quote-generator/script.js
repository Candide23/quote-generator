const quoteContainer = document.getElementById("quote-container");
const quoteText = document.getElementById("quote");
const authorText = document.getElementById("author");
const twitterBtn = document.getElementById("twitter");
const newQuoteBtn = document.getElementById("new-quote");
const loader = document.getElementById("loader");


// Show Loading
function loading(){

    loader.hidden = false;
    quoteContainer.hidden = true;
}

// Hide Loading

function complete() {
    quoteContainer.hidden = false;
    loader.hidden = true;
}


let apiQuotes = [];
// Get Quotes From API

// Show new Quote

function newQuote() {
    loading();
  // Pick a random quote from apiQuotes array

  const quote = apiQuotes[Math.floor(Math.random() * apiQuotes.length)];

  //console.log(quote);
  authorText.textContent = quote.author;
  quoteText.textContent = quote.text;

  // Check if Author field is blank and replace it with

  if (!quote.author) {
    authorText.textContent = "Unknown";
  } else {
    authorText.textContent = quote.author;
  }

  // Check Quote length to determine styling
  // Styling her font-size

  if (quote.text.length > 120) {
    quoteText.classList.add("long-quote");
  } else {
    quoteText.classList.remove("long-quote");
  }

  // Set Quote, Hide Loader

  quoteText.textContent = quote.text;
  complete();
}

async function getQuotes() {
    loading();
  const apiUrl = "https://type.fit/api/quotes";
  try {
    const response = await fetch(apiUrl);
    apiQuotes = await response.json();
    newQuote();
  } catch (error) {}
}

// Tweet Quote

function tweetQuote(){

    const twiteUrl = `https://twitter.com/intent/tweet=${quoteText.textContent} - ${authorText.textContent} - ${authorText.textContent}`;
    // allow twitter button to open to a new table
    window.open(twiteUrl, "_blank");
}

// Event Listeners
newQuoteBtn.addEventListener('click', newQuote);
twitterBtn.addEventListener('click', tweetQuote);

// On Load

getQuotes();
//loading();